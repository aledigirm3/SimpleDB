package simpledb.file;

import java.util.HashMap;
import java.util.Map;

public class BlockStats {
	private Map<String, Integer> readStats = new HashMap<>();
	private Map<String, Integer> writeStats = new HashMap<>();
	
	public BlockStats() {}
	
	public void logReadBlock(String fileName) {
		if(!readStats.containsKey(fileName)) {
			readStats.put(fileName, 1);
		}
		else {
			int currentValue = readStats.get(fileName);
			readStats.put(fileName, currentValue++);
			return;
		}
	}
	
	public void logWriteBlock(String fileName) {
		if(!writeStats.containsKey(fileName)) {
			writeStats.put(fileName, 1);
			return;
		}
		else {
			int currentValue = writeStats.get(fileName);
			writeStats.put(fileName, currentValue++);
			return;
		}
	}
}
