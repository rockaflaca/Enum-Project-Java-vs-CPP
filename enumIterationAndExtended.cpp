#include <iostream>
using namespace std;
enum Error{
    SPACE,
    LEAK, 
    FOUND 
};
int main()
{
    string messages[3] = {"Not enough space", "Memory leak", "File not found"}; // Messages attached to Enum
    enum Error error = SPACE;
    for(int i = 0; i <= 2; i++)
    {
        cout << messages[error] << "\n"; 
        error = static_cast<Error>(error + 1); //Typecasting to increment enum manually
    }
    return 0;
}