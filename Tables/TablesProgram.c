#include <stdio.h>
int main() {
    int n;
    printf("enter the number of tables: ");
    scanf("%d",&n);
    for(int i=1;i<=10;i++) {
    printf("%dx%d=%d \n",n,i,n*i);
    }
    return 0;
}