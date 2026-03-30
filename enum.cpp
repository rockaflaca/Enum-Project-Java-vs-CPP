#include <iostream>
using namespace std;
enum Level {
  LOW,
  MEDIUM,
  HIGH
};
int main() {
  enum Level myVar = MEDIUM;
  cout << myVar << "\n";
  myVar = static_cast<Level>(myVar + 1);
  cout << myVar << "\n";
  myVar = static_cast<Level>(myVar + 1);
  cout << myVar << "\n";
  myVar = static_cast<Level>(myVar + 1);
  cout << myVar << "\n";
  myVar = LOW;
  cout << myVar << "\n";
  return 0;
}