package com.spe.qrisdecoder.decoder

import com.google.gson.Gson
import com.spe.qrisdecoder.model.QrData
import com.spe.qrisdecoder.model.QrDataRawTag


/**
 * Created by Wildan Nafian on 06/07/2022.
 * Github https://github.com/Wildanafian
 * wildanafian8@gmail.com
 */
abstract class DecoderHelper {

    private var decodeResultString = ""

    protected fun doDecode(data: String) {
        decodeResultString = QrDecoderImpl().decodeString(data)
    }

    protected fun result(): QrData = Gson().fromJson(decodeResultString, QrData::class.java)

    protected fun resultRawTag(): QrDataRawTag = Gson().fromJson(decodeResultString, QrDataRawTag::class.java)

    protected fun resultString(): String = decodeResultString

}