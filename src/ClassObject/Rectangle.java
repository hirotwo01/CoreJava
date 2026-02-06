package ClassObject;

class Rectangle {
    int length;
    int breadth;
    void setDim(int l, int b) {
        length = l;
        breadth = b;
    }
    int getArea() {
        return length * breadth;
    }
}