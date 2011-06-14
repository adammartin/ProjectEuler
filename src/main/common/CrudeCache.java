package common;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class CrudeCache<T, K> {
	private LinkedList<T> keys = new LinkedList<T>();
	private Map<T, K> cache = new HashMap<T, K>();
	private final int maxCacheSize;
	
	public CrudeCache (int maxCacheSize){
		this.maxCacheSize = maxCacheSize;
	}

	public void add(T key, K value) {
		if(keys.size() >= maxCacheSize){
			cache.remove(keys.remove());
		}
		keys.add(key);
		cache.put(key, value);
	}

	public K get(T key){
		return cache.get(key);
	}
}