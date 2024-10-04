#include<stdio.h>
void main(){
     int x1,x2,x3,x4;
     int y1,y2,y3,y4,i=0,t=0,z=0,w=0,a=0,s=0,d=0;
     int N;
     scanf("%d %d %d %d\n",&x1,&x2,&x3,&x4);
     scanf("%d\n",&N);
     if(N<=100000&&N>0){
     while(i<N){
     scanf("%d%d%d%d",&y1,&y2,&y3,&y4);
        t=0;
    if(y1>=x1){
        t++;
        w++;
    }
    if(y2>=x2){
        t++;
        a++;
    }
    if(y3>=x3){
        t++;
        s++;
    }
    if(y4>=x4){
        t++;
        d++;
    }
    if(t>=3){
        printf("pass");
        z++;
    }
    if(t<3){
        printf("fail");

    }
    i++;
    }
    printf("\n%d",z);
    printf("\n%d %d %d %d",w,a,s,d);
    }
}
