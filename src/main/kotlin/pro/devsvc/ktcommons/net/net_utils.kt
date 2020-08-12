package pro.devsvc.ktcommons.net

import java.net.InetSocketAddress

import java.net.Socket

/**
 * get local ip address
 * @return ip: e.g. 192.168.1.112
 */
fun getLocalHostIP(): String {
    val socket = Socket()
    socket.use {
        it.connect(InetSocketAddress("google.com", 80))
        val ip = socket.localAddress.toString().replace("/", "")
        socket.close()
        return ip
    }
}