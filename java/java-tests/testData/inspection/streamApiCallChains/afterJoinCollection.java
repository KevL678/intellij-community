// "Replace with 'String.join'" "true"

import java.util.*;
import java.util.stream.*;

class Test {
  void test(List<? extends CharSequence> list) {
    String result = String.join("+", list);
  }
}