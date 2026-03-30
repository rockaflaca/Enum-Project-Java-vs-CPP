#include <iostream>
using namespace std;
enum Error{
    SPACE = 0,
    LEAK = 0, //Does not cause compiler error
    FOUND
};
int main()
{
    string messages[3] = {"Not enough space", "Memory leak", "File not found"}; 
    enum Error error = SPACE;
    for(int i = 0; i <= 2; i++)
    {
        cout << messages[error] << "\n";
        error = static_cast<Error>(error + 1);
    }
    return 0;
}