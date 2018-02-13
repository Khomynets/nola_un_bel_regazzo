#include<stdio.h>
#include<stdlib.h>
#include<time.h>

typedef struct{
	int pos[3];
}posto;

typedef struct{
		char er[6];
	}com;

int inserisci(int a,int b, int c);
void tabella(posto *p);

int main(){
	int sceltar,sceltac;
	int n;
	int c=0,g=0;
	int ran;
	int tv,vv;
	int end;
	int m=0;
	int sposto=1;
	int l=0,w=0;
	int frame;
	int delay=100;
	int skip;
	clock_t currTime;
	clock_t stopTime;
	posto num[3]={0,0,0,0,0,0,0,0,0};
	srand(time(NULL));
	ran=rand()%3;
	for(c=0;c<3;c++){
		num[ran].pos[c]=c+1;
	}
	end=rand()%3;
	if(end==ran){
		end=rand()%3;
	}
	
	do{
		tabella(num);
		printf("Devi spostare i piatti in ordine crescente in posizione %d\n\n",end+1);
		do{		
			do{
				printf("Scegli la colonna del piatto da spostare:");
				tv=scanf("%d",&sceltac);
				fflush(stdin);
				if(tv){
					if((sceltac==1)||(sceltac==2)||(sceltac==3)){
						vv=1;
					}else{
						printf("ERRORE\n");
						vv=0;
					}
				}else{
					printf("ERRORE\n");
				}
				
				if((num[sceltac].pos[0]==0)&&(num[sceltac].pos[1]==0)&&(num[sceltac].pos[2]==0)){
					printf("Colonna vuota, non puoi spostare il piatto.\n");
					sposto=0;
				}else{
					sposto=1;
				}
			}while(((!tv)||(!vv))||(sposto==0));
			
			do{
				printf("Scegli la colonna in cui spostarlo:");
				tv=scanf("%d",&sceltar);
				fflush(stdin);
				if(tv){
					if((sceltar==1)||(sceltar==2)||(sceltar==3)){
						vv=1;
					}else{
						printf("ERROR\n");
						vv=0;
					}
				}else{
					printf("ERRORE\n");
				}		
			}while((!tv)||(!vv)||(sceltar==sceltac));
			sceltar--;
			sceltac--;
			n=0;			
			for(c=0;c<3;c++){
				if(num[sceltar].pos[c]>0){
					n=num[sceltar].pos[c];
					c=3;
				}
			}
			m=0;
			for(c=0;c<3;c++){
				if(num[sceltac].pos[c]>0){
					m=num[sceltac].pos[c];
					c=3;
				}
			}
			if(n<m){
				l=0;
				if(n==0){
					l=1;
				}
			}else{
				l=1;
			}
			
			
			if(l==0) printf("ERRORE\n");			
		}while(l==0);
		g=0;				
		n=0;
		for(c=0;c<3;c++){
			if(num[sceltar].pos[c]==0) n=c;
		}
		for(g=0;g<3;g++){
			if(num[sceltac].pos[g]>0){
				num[sceltar].pos[n]=num[sceltac].pos[g];
				num[sceltac].pos[g]=0;
				g=3;
			}
		}
		if((num[end].pos[0]==1)&&(num[end].pos[1]==2)&&(num[end].pos[2]==3)) w=1;
		system("cls");
		if(w==1){
			for(frame=0;frame<30;frame=frame+1){
				system("cls");
				for(skip=0;skip<frame;skip=skip+1){
		            printf("\n");
				}
				printf("Hai vinto!!!!!!!!");
				currTime=clock();
				stopTime=currTime+delay;
				do{
					currTime=clock();
				}while(currTime<stopTime);
				if(frame%2==0){
					system("COLOR 4C");
				}else{
					system("COLOR 1B");
				}
			}			
		}
	}while(w==0);
	return 0;
}


void tabella(posto *p){
	com tr[9];
	int c=0,i=0,k=0;
	for(c=0;c<3;c++){
		for(i=0;i<3;i++){
			if(p[c].pos[i]==0){
				tr[k].er[0]='.';
				tr[k].er[1]='.';
				tr[k].er[2]='.';
				tr[k].er[3]='.';
				tr[k].er[4]='.';
				tr[k].er[5]='\0';
			}	
			if(p[c].pos[i]==1){
				tr[k].er[0]='.';
				tr[k].er[1]='.';
				tr[k].er[2]='X';
				tr[k].er[3]='.';
				tr[k].er[4]='.';
				tr[k].er[5]='\0';
			}
			if(p[c].pos[i]==2){
				tr[k].er[0]='.';
				tr[k].er[1]='X';
				tr[k].er[2]='X';
				tr[k].er[3]='X';
				tr[k].er[4]='.';
				tr[k].er[5]='\0';
			}
			if(p[c].pos[i]==3){
				tr[k].er[0]='X';
				tr[k].er[1]='X';
				tr[k].er[2]='X';
				tr[k].er[3]='X';
				tr[k].er[4]='X';
				tr[k].er[5]='\0';
			}
			k++;
		}
	}
	printf("%s   %s   %s\n",tr[0].er,tr[3].er,tr[6].er);
	printf("%s   %s   %s\n",tr[1].er,tr[4].er,tr[7].er);
	printf("%s   %s   %s\n",tr[2].er,tr[5].er,tr[8].er);
	printf("__________________________________\n");
	printf("  1       2       3\n");
}
