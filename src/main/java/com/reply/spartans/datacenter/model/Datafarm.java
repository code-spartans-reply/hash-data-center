package com.reply.spartans.datacenter.model;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Datafarm model: constituted by different rows, each with one one or more space slots
 */

public class Datafarm {
	
	final List<Slot>[] serverRows;
	
	@SuppressWarnings("unchecked")
	public Datafarm(int rows) {
		this.serverRows = new List[rows];
	}

	public List<Slot> getServerRow(int index) {
		return serverRows[index];
	}
	
	public void setSlotsSpaceAtRows(int index, Slot... spaces) {
		this.serverRows[index] = Arrays.asList(spaces);
	}
	
	public Stream<List<Slot>> rows() {
		return Arrays.stream(serverRows);
	}
}
