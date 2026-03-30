#include <iostream>
using namespace std;
enum Level { // Enum structure
  LOW,
  MEDIUM,
  HIGH
};
int main() {
  enum Level myVar = MEDIUM; // Initalizes a new enum myVar with the Level struct
  cout << myVar << "\n";
  return 0;
}