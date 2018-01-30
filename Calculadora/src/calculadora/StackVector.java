package calculadora;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Revilo
 * @param <E> generic
 */
public class StackVector<E> implements Stack<E> {
    
    protected Vector<E> data;
    
    public StackVector()
     // post: constructs a new, empty stack
    {
        data = new Vector<E>();
    }
    /**
     * @param item
    * 
    */
    @Override
    public void push(E item)
	// post: the value is added to the stack
	//          will be popped next if no intervening push
	{
		data.add(item);
	}

    /**
     *
     * @return most recently pushed item
     */
    @Override
	public E pop()
	// pre: stack is not empty
	// post: most recently pushed item is removed and returned
	{
		return data.remove(size()-1);
	}

    /**
     *
     * @return top value (next to be popped)
     */
    @Override
	public E peek()
	// pre: stack is not empty
	// post: top value (next to be popped) is returned
	{
		return data.get(size() - 1);
	}
	
    /**
     *
     * @return returns the number of elements in the stack
     */
    @Override
	public int size()
	// post: returns the number of elements in the stack
	{
		return data.size();
	}
  
    /**
     *
     * @return returns true if and only if the stack is empty
     */
    @Override
	public boolean empty()
	// post: returns true if and only if the stack is empty
	{
		return size() == 0;
	}
}
