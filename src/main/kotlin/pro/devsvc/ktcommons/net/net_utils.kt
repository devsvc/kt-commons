package pro.devsvc.ktcommons.net

import java.net.DatagramSocket
import java.net.InetAddress
import java.net.Socket


/**
 * get local ip address
 * @return ip: e.g. 192.168.1.112
 */
fun getLocalHostIP(): String {
    DatagramSocket().use { socket ->
        socket.connect(InetAddress.getByName("8.8.8.8"), 10002)
        return socket.localAddress.hostAddress
    }
}