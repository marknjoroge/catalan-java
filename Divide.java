public class Divide {

  int HowManyWays(int n) {
    int res = 0;

    if (n <= 1) {
      return 1;
    }
    for (int i = 0; i < n; i++) {
      res += HowManyWays(i) * HowManyWays(n - i - 1);
    }
    return res;
  }
}
