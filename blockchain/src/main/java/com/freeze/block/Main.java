package com.freeze.block;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		String address = "66666666";
		List<Transaction> txs = new ArrayList<Transaction>();
		List<Block> blockchain = new ArrayList<Block>();
		blockchain.add(new Block(1, "1", System.currentTimeMillis(), txs, 1, "1"));
		
		BlockUtils.mineBlock(blockchain, txs, address);
		
		int walletBalance = BlockUtils.getWalletBalance(blockchain, address);
		System.out.println(address+"钱包的余额:"+walletBalance);
		
	}

}
