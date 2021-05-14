package pro.devsvc.ktcommons.json

import com.fasterxml.jackson.databind.JsonNode

fun JsonNode.getString(key: String): String? {
    return this.get(key)?.asText()
}

fun JsonNode.getInt(key: String): Int? {
    return this.get(key)?.asInt()
}

fun JsonNode.getBoolean(key: String): Boolean? {
    return this.get(key)?.asBoolean()
}