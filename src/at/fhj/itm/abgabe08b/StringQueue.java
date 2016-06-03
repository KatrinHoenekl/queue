/**
 * @author Katrin
 * Buffer solution which data in ascending order by time since
 * the last processing provides : first edit oldest data.
 */

/**
 * @author jasmin
 * 
 * fdfdfdfdf
 */

package at.fhj.itm.abgabe08b;

import java.util.NoSuchElementException;
import java.util.Vector;


public class StringQueue implements Queue {

	private Vector<String> queue;

	public StringQueue() {
		this.queue = new Vector<String>();
	}
/**
 * (non-Javadoc)
 * @see at.fhj.itm.abgabe08b.Queue#offer(java.lang.String)
 * @param String obj, the element to add
 * @returns true if the element was added to the queue
 */
	public boolean offer(String obj) {
		this.queue.addElement(obj);
		return true;
	}
/**
 * (non-Javadoc)
 * @see at.fhj.itm.abgabe08b.Queue#poll()
 * @returns the head of this queue, or null if this queue is empty
 */
	@Override
	public String poll() {
		if (queue.size() == 0) {
			return null;
		} else {
			String q = queue.get(0);
			queue.removeElementAt(0);
			return q;
		}

	}
/**
 * (non-Javadoc)
 * @see at.fhj.itm.abgabe08b.Queue#remove()
 * @returns the head of this queue 
 * @throws NoSuchElementException if the queue is empty
 */
	@Override
	public String remove() {
		String q = poll();
		if (q != null) {
			return q;

		} else {
			throw new NoSuchElementException();
		}

	}
/**
 * (non-Javadoc)
 * @see at.fhj.itm.abgabe08b.Queue#peek()
 * @returns the head or null if the queue is empty
 */
	@Override
	public String peek() {
		if (queue.size() == 0) {
			return null;
		} else {
			String q = queue.get(0);
			return q;
		}
	}
/**
 * (non-Javadoc)
 * @see at.fhj.itm.abgabe08b.Queue#element()
 * @returns the head of this queue
 * @throws NoSuchElementException if it is empty
 */
	@Override
	public String element() {
		if (queue.size() == 0) {
			throw new NoSuchElementException();
		} else {
			String q = queue.get(0);
			return q;
		}
	}

}
