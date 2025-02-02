package stack;

import java.util.ArrayList;

public class StackUsingArrayList<T> {

    private ArrayList<T> stack;

    public StackUsingArrayList(){
        stack = new ArrayList<>();
    }

    public void push(T element){
        stack.add(element);
    }

    public T pop(){
      if(isEmpty()){
          throw new RuntimeException("stack is empty");
      }
      return stack.remove(stack.size()-1);
    }

    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return stack.get(stack.size()-1);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public int size(){
       return stack.size();
    }

    public void printStack(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        System.out.println("Stack elements are: ");
        for(T elements: stack){
            System.out.println(elements);
        }
    }



}
