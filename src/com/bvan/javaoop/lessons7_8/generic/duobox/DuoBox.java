package com.bvan.javaoop.lessons7_8.generic.duobox;

/**
 * @author bvanchuhov
 */
public class DuoBox<L, R> {

    private final L left;
    private final R right;

    public DuoBox(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }

    @Override
    public String toString() {
        return "DuoBox{" +
                "left=" + left +
                ", right=" + right +
                '}';
    }
}
