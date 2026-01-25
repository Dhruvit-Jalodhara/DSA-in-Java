package L15_OOPs.L6_Polymorphism;

/*
 =========================
 RETURNING OBJECTS
 =========================

 DEFINITION:
 A method can return an object.
 The returned object continues to exist
 as long as a reference points to it.
*/
class Test {

    int a;

    Test(int i) {
        a = i;
    }

    /*
     Each call creates a NEW object
     and returns its reference.
    */
    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }
}

class ReturnObject {
    public static void main(String[] args) {

        Test ob1 = new Test(2);
        Test ob2;

        ob2 = ob1.incrByTen();

        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
    }
}

