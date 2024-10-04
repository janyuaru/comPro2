#include<stdio.h>
void main(){

    int x;
    int y;
    int z;
    int bag;
    int bottle=0;
    int bread=0;
    int egg=0;
    int remain_bottle=0;
    int remain_bread=0;
    int remain_egg=0;

    scanf("%d%d%d",&x,&y,&z);
    if(x<y && x<z){
        bag=x/3;
    }
    else if(y<z && y<x){
        bag=y/4;
    }
    else if(z<x && z<y){
        bag=z/2;
    }

    bottle=bag*3;
    bread=bag*4;
    egg=bag*2;

    remain_bottle=x-bottle;
    remain_bread=y-bread;
    remain_egg=z-egg;

    printf("%d %d %d %d",bag,remain_bottle,remain_bread,remain_egg);
}
