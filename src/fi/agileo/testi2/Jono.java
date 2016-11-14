/**
 * 
 */
package fi.agileo.testi2;

import java.util.ArrayList;

/**
 * @author oppi
 *
 */
class Jono<E> implements GeneerinenJono<E>, Cloneable {

	private int size;
	private int top=-1;
	private E[] stack;
	
	private ArrayList<E> list;
	  
	  public Jono() 
	  {   
		  this.list = new ArrayList<E>();   
	  }
	
	  public ArrayList<E> getList() {
		return list;
	}

	public void setList(ArrayList<E> list) {
		this.list = list;
	}

	@Override
		public boolean empty() {
			// TODO Auto-generated method stub
			if (top == -1) {
			return true;
			}
			else return false;
		}

		@Override
		public void push(E alkio) {
			this.list.add(alkio);
		//	stack[++top] = alkio;
			// TODO Auto-generated method stub
			
		}

		@Override
		public E pop() {
			E alkio = list.get(0);
			list.remove(alkio);
			return alkio;
		//	return stack[top--];	
		}

		@Override
		public E front() {
			// TODO Auto-generated method stub
			E alkio = list.get(0);
			return alkio;
			//	return stack[top];
		}

		@Override
		public int size() {
			// TODO Auto-generated method stub
			int koko = list.size();
			return koko;
		}

		 public boolean isFull() {
		        return (top == size - 1);
		    }
	  
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	 Jono<Henkilo> jono = new Jono<Henkilo>(); 
	// ika, pituus, paino
	 Henkilo aku = new Henkilo("Aku", 50, 170, 70);
	 Henkilo tupu = new Henkilo("tupu", 14, 155, 40);
	 Henkilo lupu = new Henkilo("hupu", 14, 156, 41);
	 Henkilo hupu = new Henkilo("lupu", 14, 157, 42);
	 
	 // if (!jono.empty()) {
	 jono.push(aku);
	 jono.push(tupu);
	 jono.push(lupu);
	 jono.push(hupu);
	 
	 jono.pop();
	 
	 int koko = jono.size();
	 System.out.println("jonon koko:" +koko);
	 
	 
	 int value = jono.size();
	 System.out.println(aku);
	 
	 
     
     System.out.println("jonon koko on " +value);
	 
	 
	}
}
