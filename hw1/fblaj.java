public class fblaj {
    public static int feibo(int n) {
        if (n > 0) {
            if (n == 1) return 1;
            if (n == 2) return 1;
            return feibo(n - 1) + feibo(n - 2);
        }
        return -1;
    }
}
