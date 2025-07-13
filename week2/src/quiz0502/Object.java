//Quiz 5-2 prob 6
package quiz0502;

public class Object {
    String value;

    public Object(String value) {
        this.value = value;
    }

    public static void main(String[] args) {
        Object obj = new Object("test");
        obj = null;

        //obj 인스턴스는 힙 메모리에 있는 Object 클래스 객체를 하나 참조하고 있는데 null로 설정하면,
        //포인팅하고 있던 객체 -> null이 되므로 이전에 만든 New Object("test") 객체는 더이상 접근 불가능한 객체가 된다.
        //자바에서는 이러한 객체를 가비지 컬렉터가 알고리즘을 사용하여 메모리에서 해제해준다.
    }
}
