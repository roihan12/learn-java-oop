 class Rectangle extends Shape {
    int getCorner() {
        return 4;
    }
    // super -> get method overridding from parrent class s
    int getParentCorner() {
        return super.getCorner();
    }
}
