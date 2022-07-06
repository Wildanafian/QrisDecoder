package com.spe.qrisdecoder.model

import com.google.gson.annotations.SerializedName

data class QrDataRawTag(

    @field:SerializedName("data")
    val data: BodyData? = null,

    @field:SerializedName("isValid")
    val isValid: Boolean = false
)

data class BodyData(
    @field:SerializedName("00")
    val tag00: String? = "",

    @field:SerializedName("01")
    val tag01: String? = "",

    @field:SerializedName("02")
    val tag02: String? = "",

    @field:SerializedName("03")
    val tag03: String? = "",

    @field:SerializedName("04")
    val tag04: String? = "",

    @field:SerializedName("05")
    val tag05: String? = "",

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
    val tag51: List<SubTag>,

    @field:SerializedName("52")
    val tag52: String? = "",

    @field:SerializedName("53")
    val tag53: String? = "",

    @field:SerializedName("54")
    val tag54: String? = "",

    @field:SerializedName("55")
    val tag55: String? = "",

    @field:SerializedName("56")
    val tag56: String? = "",

    @field:SerializedName("57")
    val tag57: String? = "",

    @field:SerializedName("58")
    val tag58: String? = "",

    @field:SerializedName("59")
    val tag59: String? = "",

    @field:SerializedName("60")
    val tag60: String? = "",

    @field:SerializedName("61")
    val tag61: String? = "",

    @field:SerializedName("62")
    val tag62: List<SubTag>,

    @field:SerializedName("63")
    val tag63: String? = ""
)

data class SubTag(

    @field:SerializedName("00")
    val tag00: String? = "",

    @field:SerializedName("01")
    val tag01: String? = "",

    @field:SerializedName("02")
    val tag02: String? = "",

    @field:SerializedName("03")
    val tag03: String? = "",

    @field:SerializedName("04")
    val tag04: String? = "",

    @field:SerializedName("08")
    val tag08: String? = "",

    @field:SerializedName("99")
    val tag99: String? = "",

    @field:SerializedName("raw")
    val raw: String? = ""
)
