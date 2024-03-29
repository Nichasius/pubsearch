package ps.struct;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Int set structure.
 */
@SuppressWarnings("rawtypes")
public class IntSet extends TreeSet implements Comparable {
	private static final long serialVersionUID = -6714599852202057981L;

	public IntSet() {
		super();
	}

	@SuppressWarnings("unchecked")
	public IntSet(Set s) {
		super(s);
	}

	public int hashCode() {
		return size();
	}

	public boolean equals(Object o) {
		if (o == null)
			return false;
		int n = compareTo(o);
		return (n == 0);
	}

	public int compareTo(Object o) {
		if (o == null)
			return 1;
		TreeSet to = (TreeSet) o;
		Iterator it = iterator();
		Iterator oit = to.iterator();
		while (it.hasNext()) {
			Integer mi = (Integer) it.next();
			if (oit.hasNext()) {
				Integer oi = (Integer) oit.next();
				if (mi.intValue() < oi.intValue())
					return -1;
				else if (mi.intValue() > oi.intValue())
					return 1;
			} else
				return 1;
		}
		if (oit.hasNext())
			return -1;
		else
			return 0;
	}
}
