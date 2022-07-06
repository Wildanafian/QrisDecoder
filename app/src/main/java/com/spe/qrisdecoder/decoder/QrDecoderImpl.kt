package com.spe.qrisdecoder.decoder

import org.json.JSONArray
import org.json.JSONObject


/**
 * Created by Wildan Nafian on 06/07/2022.
 * Github https://github.com/Wildanafian
 * wildanafian8@gmail.com
 */
class QrDecoderImpl : QrDecoder {
    override fun decodeString(data: String): String {
        val resultData = JSONObject()
        if (data.checkValidity()) {
            var tempData = data.replace("\n", "")
            val tempResultData = JSONObject()
            var i = 0
            while (tempData.isNotEmpty() && i < 100) {
                val tag = tempData.take(2)
                tempData = tempData.drop(2)
                val tagLength = tempData.take(2).toDouble().toInt()
                tempData = tempData.drop(2)
                val tagValue = tempData.take(tagLength)
                tempData = tempData.drop(tagLength)

                tempResultData.put(
                    tag,
                    if (tag.checkSubValue()) getSubValue(tagValue) else tagValue
                )
                i++
            }
            resultData.put("isValid", true)
            resultData.put("data", tempResultData)
        } else {
            resultData.put("isValid", false)
            resultData.put("data", "")
        }
        return resultData.toString()
    }

    private fun getSubValue(value: String): JSONArray? {
        val resultDataArray = JSONArray()
        val resultData = JSONObject()
        var tempData = value
        var i = 0
        resultData.put("raw", value)
        while (tempData.isNotEmpty() && i < 5) {
            val subTag = tempData.take(2)
            tempData = tempData.drop(2)
            val takeValueLength = tempData.take(2).toDouble().toInt()
            tempData = tempData.drop(2)
            val takeValue = tempData.take(takeValueLength)
            tempData = tempData.drop(takeValueLength)
            resultData.put(subTag, takeValue)
            i++
        }
        return resultDataArray.put(resultData)
    }

    private fun String.checkValidity(): Boolean {
        return this.startsWith("00", true)
    }

    private fun String.checkSubValue(): Boolean {
        return this.toDouble().toInt() in 26..51 || this.toDouble().toInt() == 62
    }
}