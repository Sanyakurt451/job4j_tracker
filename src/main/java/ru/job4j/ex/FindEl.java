package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (key.equals(value[i])) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element not found exception");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] rsl = {"found"};
        try {
            indexOf(rsl, "founy");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
        e.printStackTrace();
        } catch (Throwable th) {
        th.printStackTrace();
      }
    }
}
