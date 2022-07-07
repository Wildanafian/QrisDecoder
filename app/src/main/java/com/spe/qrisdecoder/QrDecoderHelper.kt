package com.spe.qrisdecoder

import com.spe.qrisdecoder.decoder.DecoderHelper
import com.spe.qrisdecoder.model.QrData
import com.spe.qrisdecoder.model.QrDataRawTag


/**
 * Created by Wildan Nafian on 06/07/2022.
 * Github https://github.com/Wildanafian
 * wildanafian8@gmail.com
 */
class QrDecoderHelper : DecoderHelper() {

    fun decodeQR(data: String) = doDecode(data)

    fun getResult(): QrData = result()

    fun getResultRawTag(): QrDataRawTag = resultRawTag()

    fun getResultInString(): String = resultString()
}