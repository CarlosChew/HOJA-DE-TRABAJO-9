/**
 * @author Carlos Chew
 * @author Otto Trujillo
 *
 */

import java.util.Map;

public class Association<K extends Comparable<K>, V> implements Map.Entry<K,V> {

	protected K key;

	protected V value;

	public Association(K k, V v) {
		k = key;
		v = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public V setValue(V v) {
		V oldvalue = value;
		value = v;
		return oldvalue;
	}
	public int compareTo(K key) {
		return key.compareTo(key);
	}
}