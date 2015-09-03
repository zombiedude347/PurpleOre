package net.purpleore.proxy;

public class ServerProxy extends CommonProxy {
	@Override
	public boolean isClient() {
		return false;
	}

	@Override
	public boolean isServer() {
		return true;
	}

	@Override
	public void registerRenderers() {
	}
}
