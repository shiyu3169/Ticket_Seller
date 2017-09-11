/**
 * Shiyu Wang
 * shiyu@ccs.neu.edu
 * 
 * 
 */

/**
 * abstract class of FListInteger
 * 
 * @author Shiyu
 * @version d2013-9-26
 * 
 */
public abstract class FListInteger {
    /**
     * make a new emptyList
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return a emptyList
     */
    public static FListInteger emptyList() {
        return new EmptyList();
    }

    /**
     * make a new add
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param f
     *            - the rest FListInteger
     * @param x
     *            - the first int
     * @return a new add
     */
    public static FListInteger add(FListInteger f, int x) {
        return new Add(f, x);
    }

    /**
     * determine given FListInteger is emptyList or not
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param f
     *            - given FListInteger
     * @return a boolean is it emptyList
     */
    public static boolean isEmpty(FListInteger f) {
        return f.isEmpty();
    }

    /**
     * get the integer of given FListInteger at given position;
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param f
     *            - given FListInteger
     * @param n
     *            - given position
     * @return - the integer at given position
     */
    public static Integer get(FListInteger f, Integer n) {
        return f.get(n);
    }

    /**
     * set the given integer at the required place
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param f
     *            - the FListInteger will be set
     * @param n
     *            - the required position
     * @param y
     *            - the integer will be set in
     * @return - the changed FListInteger
     */
    public static FListInteger set(FListInteger f, int n, int y) {
        return f.set(n, y);
    }

    /**
     * count the size of given FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param f
     *            - given FListInteger
     * @return - the size of given FListInteger
     */
    public static int size(FListInteger f) {
        return f.size();
    }

    /**
     * determine whether it is emptyList
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return - boolean is it emptyList
     */
    public abstract boolean isEmpty();

    /**
     * get the given position's int
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param n
     *            - given position
     * @return - the givein position's int
     */
    public abstract Integer get(Integer n);

    /**
     * set the given int at required position
     * 
     * @author Shiyu
     * @versiond 2013-9-26
     * @param n
     *            - required position
     * @param y
     *            - given int
     * @return the changed FListInteger
     */
    public abstract FListInteger set(int n, int y);

    /**
     * count the size of FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the size of FListInteger
     */
    public abstract int size();

    /**
     * change the FListInteger to special string case
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the string case
     */
    public abstract String toString();

    /**
     * return the hashCode of FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the haseCode
     */
    public abstract int hashCode();

    /**
     * check if given object is equal to FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param o
     *            - the given object
     * @return the boolean are they equal
     */
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }
        if ((o instanceof FListInteger)) {
            if (FListInteger.isEmpty(this)) {
                return FListInteger.isEmpty((FListInteger) o)
                        && this.hashCode() == o.hashCode();
            }
            if (FListInteger.size(this) !=
                    FListInteger.size((FListInteger) o)) {
                return false;
            } 
            else {
                for (int i = 0; i < FListInteger.size(this); i++) {
                    if (!(FListInteger.get(this, i).equals(FListInteger.get(
                             (FListInteger) o, i)))) {
                        return false;
                    }
                }
                return true;
            }
        } 
        else {
            return false;
        }

    }
}

/**
 * the emptyList extends from FListInteger
 * 
 * @author Shiyu
 * @version 2013-9-26
 */
class EmptyList extends FListInteger {

    /**
     * determine given FListInteger is emptyList or not
     * @author Shiyu
     * @version 2013-9-26
     * @return a boolean is it emptyList
     */
    public boolean isEmpty() {
        return true;
    }

    /**
     * get the element integer at the required place
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param n
     *            - the required place
     * @return - the element at required place
     */
    public Integer get(Integer n) {
        throw new RuntimeException("this is emptyList");
    }

    /**
     * set the given int at required position
     * 
     * @author Shiyu
     * @versiond 2013-9-26
     * @param n
     *            - required position
     * @param y
     *            - given int
     * @return the changed FListInteger
     */
    public FListInteger set(int n, int y) {
        throw new RuntimeException("you can't set in emptyList");
    }

    /**
     * count the size of FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the size of FListInteger
     */
    public int size() {
        return 0;
    }

    /**
     * change the FListInteger to special string case
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the string case
     */
    public String toString() {
        return "[]";
    }

    /**
     * return the hashCode of FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the haseCode
     */
    public int hashCode() {
        return FListInteger.size(this);
    }

}

/**
 * the FListInteger extends from FListInteger
 * 
 * @author Shiyu
 * @version 2013-9-26
 */
class Add extends FListInteger {
    /**the rest FListInteger */
    FListInteger f;
    /**the first int */
    int          x;

    /**
     * the constractor
     * @param f - the rest FlistInteger
     * @param x - the first integer
     */
    Add(FListInteger f, int x) {
        this.f = f;
        this.x = x;
    }

    /**
     * determine given FListInteger is emptyList or not
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return a boolean is it emptyList
     */
    public boolean isEmpty() {
        return false;
    }

    /**
     * get the given position's int
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @param n
     *            - given position
     * @return - the givein position's int
     */
    public Integer get(Integer n) {
        if (n == 0) {
            return x;
        }
        else {
            return FListInteger.get(f, n - 1);
        }
    }

    /**
     * set the given int at required position
     * 
     * @author Shiyu
     * @versiond 2013-9-26
     * @param n
     *            - required position
     * @param y
     *            - given int
     * @return the changed FListInteger
     */
    public FListInteger set(int n, int y) {
        if (n == 0) {
            return FListInteger.add(f, y);
        } 
        else {
            return FListInteger.add(FListInteger.set(f, n - 1, y), x);
        }
    }

    /**
     * count the size of FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the size of FListInteger
     */
    public int size() {
        return 1 + FListInteger.size(f);
    }

    /**
     * change the FListInteger to special string case
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the string case
     */
    public String toString() {
        if (FListInteger.isEmpty(f)) {
            return "[" + x + "]";
        } 
        else {
            return "[" + x + ", "
                    + f.toString().substring(1, f.toString().length());
        }
    }

    /**
     * return the hashCode of FListInteger
     * 
     * @author Shiyu
     * @version 2013-9-26
     * @return the haseCode
     */
    public int hashCode() {
        return FListInteger.size(this);
    }

}
