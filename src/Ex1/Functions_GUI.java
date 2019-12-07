package Ex1;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Copy;

import Ex1.StdDraw;;

public class Functions_GUI implements functions {
	private LinkedList<function> Functions;
	
	
	@Override
	public int size() {
		return Functions.size();
	}

	
	@Override
	public boolean isEmpty() {
		return Functions.isEmpty();
	}

	
	@Override
	public boolean contains(Object o) {
		return Functions.contains(o);
	}

	
	@Override
	public Iterator<function> iterator() {
		Iterator<function> iterator = this.Functions.iterator();
		return iterator;
	}

	
	@Override
	public Object[] toArray() {
		function[] ans = new function[this.size()];
		this.toArray(ans);
		return ans;
	}

	
	@Override
	public <T> T[] toArray(T[] a) {
		if(a.length < this.size()) {
			throw new RuntimeException("The given array is to small");
		}
		int i = 0;
		Iterator<function> iterator = this.iterator();
		while(iterator.hasNext()) {
			ComplexFunction temp = (ComplexFunction) iterator.next().copy();
			a[i] = (T) temp;
		}
		return a;
	}
	

	@Override
	public boolean add(function e) {
		// TODO Auto-generated method stub
		
		Iterator<function> iterator = this.iterator();
		boolean flag = false;
		while(iterator.hasNext() && flag) {
			function it = iterator.next();
			if(e.equals(it)) {
				flag = false;
			}
			else  {
				flag  = true ;
				break;
			}
		}
		
		return flag;
		
		

	}

	@Override
	public boolean remove(Object o) {
		// TODO Auto-generated method stub
		
		Iterator<function> iterator = this.iterator();
		boolean b = false;
		while(iterator.hasNext()) {
			function it = iterator.next();
			if (it.equals(o)) {
				this.Functions.remove(it);
				b = true;
			}
				if (b == true) {
					break;
				}
				
			}
		
		return b;
		
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		
		if(this.size() < c.size()) {
			return false;
		}
		
		Iterator<?> iterator = this.iterator();
		
		Iterator<?> iterator1 = c.iterator();
		
		boolean flag = false;
		for (int i = 0; i < this.size(); i++) {
			Object o = iterator.next();
			for (int j = 0; j < c.size(); j++) {
				Object o1 = iterator1.next();
				if(o1.equals(o)) {
					flag = true;
					i++;
					break;
				}
				
			}
		}
		return flag;
	}

	@Override
	public boolean addAll(Collection<? extends function> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initFromFile(String file) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saveToFile(String file) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFunctions(int width, int height, Range rx, Range ry, int resolution) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawFunctions(String json_file) {
		// TODO Auto-generated method stub
		
	}
	

}