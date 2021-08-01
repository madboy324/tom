package com.ysbzc.day15.java;

/**
 * 
 * @Description 接口代理模式
 * @author wyl
 * @date 2020-8-12 10:26:29
 */
public class NetWorkTest {
	public static void main(String[] args) {
		Server server = new Server();
		
		ProxyServer proxyServer = new ProxyServer(server);
		proxyServer.browse();
	}
}

interface Network {
	public void browse();
}

class Server implements Network {

	@Override
	public void browse() {
		System.out.println("真实的");
	}

}

class ProxyServer implements Network {
	private Network work;

	public ProxyServer(Network work) {
		this.work = work;
	}

	@Override
	public void browse() {
		check();
		work.browse();

	}

	public void check() {
		System.out.println("联网器的检查操作");

	}
}