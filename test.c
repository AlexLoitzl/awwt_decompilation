#include <stdio.h>
int global = 1;
int multiply(int a, int b) {
  return a * b;
}

int third_index(int arr[3]) {
  return arr[2];
}

void side_effect() {
  printf("Hello World!");
  global = 0;
}

int main() {
  int array[3] = {1,2,3};
  multiply(array[0],third_index(array));
  side_effect();
  return global;
}
