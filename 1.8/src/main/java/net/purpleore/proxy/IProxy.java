package net.purpleore.proxy;

public interface IProxy {

	boolean isClient();

	boolean isServer();

	void registerRenderers();

}
