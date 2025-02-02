package stack;

public class Main {

    public String reverse(String str){
        StackUsingArrayList<Character> stack = new StackUsingArrayList<>();

        for(char c: str.toCharArray()){
            stack.push(c);
        }

        StringBuilder reversedString = new StringBuilder();
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        return reversedString.toString();
    }
    public static void main(String[] args) {
        Stack myStack = new Stack(1);

//        myStack.push(2);
//        myStack.pop();
//        myStack.getTop();
//        myStack.getHeight();
//        myStack.printStack();


        StackUsingArrayList stack2 = new StackUsingArrayList();

        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);


//        stack2.pop();
        System.out.println("Peek elememt is: "+stack2.peek());
        System.out.println("is stack empty ? : "+stack2.isEmpty());
        System.out.println("stack size: "+stack2.size());
        stack2.printStack();

    }
}
