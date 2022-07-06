package com.spe.qrisdecoder.model

import com.google.gson.annotations.SerializedName

data class QrData(
    @field:SerializedName("data")
    val data: BodyDataQrData,

    @field:SerializedName("isValid")
    val isValid: Boolean = false
)

data class BodyDataQrData(
    @field:SerializedName("00")
    val qrVersion: String? = "",

    @field:SerializedName("01")
    val qrType: String? = "",

    @field:SerializedName("02")
    val visaId: String? = "",

    @field:SerializedName("03")
    val tag03: String? = "",

    @field:SerializedName("04")
    val masterCardId: String? = "",

    @field:SerializedName("05")
    val refID: String? = "",

    @field:SerializedName("26")
    val tag26: List<SubTag>,

    @field:SerializedName("27")
    val tag27: List<SubTag>,

    @field:SerializedName("28")
    val tag28: List<SubTag>,

    @field:SerializedName("29")
    val tag29: List<SubTag>,

    @field:SerializedName("30")
    val tag30: List<SubTag>,

    @field:SerializedName("31")
    val tag31: List<SubTag>,

    @field:SerializedName("32")
    val tag32: List<SubTag>,

    @field:SerializedName("33")
    val tag33: List<SubTag>,

    @field:SerializedName("34")
    val tag34: List<SubTag>,

    @field:SerializedName("35")
    val tag35: List<SubTag>,

    @field:SerializedName("36")
    val tag36: List<SubTag>,

    @field:SerializedName("37")
    val tag37: List<SubTag>,

    @field:SerializedName("38")
    val tag38: List<SubTag>,

    @field:SerializedName("39")
    val tag39: List<SubTag>,

    @field:SerializedName("40")
    val tag40: List<SubTag>,

    @field:SerializedName("41")
    val tag41: List<SubTag>,

    @field:SerializedName("42")
    val tag42: List<SubTag>,

    @field:SerializedName("43")
    val tag43: List<SubTag>,

    @field:SerializedName("44")
    val tag44: List<SubTag>,

    @field:SerializedName("45")
    val tag45: List<SubTag>,

    @field:SerializedName("46")
    val tag46: List<SubTag>,

    @field:SerializedName("47")
    val tag47: List<SubTag>,

    @field:SerializedName("48")
    val tag48: List<SubTag>,

    @field:SerializedName("49")
    val tag49: List<SubTag>,

    @field:SerializedName("50")
    val tag50: List<SubTag>,

    @field:SerializedName("51")
    val nmid: List<SubTag>,

    @field:SerializedName("52")
    val merchantType: String? = "",

    @field:SerializedName("53")
    val currencyCode: String? = "",

    @field:SerializedName("54")
    val amount: String? = "",

    @field:SerializedName("55")
    val tip: String? = "",

    @field:SerializedName("56")
    val fixedFee: String? = "",

    @field:SerializedName("57")
    val percentageFee: String? = "",

    @field:SerializedName("58")
    val countryCode: String? = "",

    @field:SerializedName("59")
    val merchantName: String? = "",

    @field:SerializedName("60")
    val merchantCity: String? = "",

    @field:SerializedName("61")
    val postalCode: String? = "",

    @field:SerializedName("62")
    val additionalDataField: List<SubTag>,

    @field:SerializedName("63")
    val crc: String? = ""
)