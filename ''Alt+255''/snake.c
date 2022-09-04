/** @author Tsetsentsengel Munkhbayar
  * Snake game
  * written in Turbo C++ by C programming language
  * My first game which is written by C
  * 30 Sep 2010 */
 
#include "stdio.h"
#include "conio.h"
#include "dos.h"
#include "time.h"
#include "stdlib.h"
#include "math.h"

#define bool int

const int VK_ESC = 27;
const int VK_UP = 72;
const int VK_DOWN = 80;
const int VK_LEFT = 75;
const int VK_RIGHT = 77;
const int TIME = 200;
const char LT = 201; //Corner of left top
const char RT = 187; //Corner of right top
const char LB = 200;
const char RB = 188; // Corner of right bottom
const char H = 186; 
const char V = 205;
const char ms = 224;
const char VK_SP = 32;
const int true = 1;
const int false = 0;
static char key = 'a';
static int point = 0;
static int high_point = 0;
struct Point{
    int x;
    int y;
};

struct Snake{
    int direction;
    struct Point body[400];
    int length;
    int eaten_mouse;
}snake;

struct Mouse{
    struct Point position;
    struct Point old_position[500];
}mouse;

void initialize_snake();
void draw_snake();
void draw_mouse();
void draw_screen();
void move_up();
void move_down();
void move_left();
void move_right();
void move_snake();
bool collision_wall();
bool collision_mouse();
void collision_snake();
void controller();
void start_game();
void game_over();
void initialize_mouse();
void prolong_snake();
void title();
void border();
void draw_point();

int main(){
    start_game();
    while(1){
        clrscr();
        draw_screen();
        controller();
        move_snake();
        draw_snake();
        draw_mouse();
        if(key == VK_ESC){
            game_over();
            break;
        }
        delay(TIME);
    }
    return 0;
}
void initialize_snake(){
    int i;
    snake.direction = VK_RIGHT;
    snake.length = 5;
    snake.eaten_mouse = 0;
    for(i = 0; i < snake.length; i++){
        snake.body[i].x = snake.length - i + 10;
        snake.body[i].y = 10;
    }
}

void initialize_mouse(){
    bool Ok = true;
    int i;
    randomize();
    do{
        mouse.position.x = rand() % 19 + 6;
        mouse.position.y = rand() % 19 + 6;
        for(i = 0; i < snake.length; i++)
            if(mouse.position.x == snake.body[i].x &&
                mouse.position.y == snake.body[i].y){
           
                Ok = false;
                break;
            }
    }while(Ok == false);
}

void draw_snake(){
    int i;
    textcolor(BROWN);
    gotoxy(snake.body[0].x, snake.body[0].y);
    cprintf("X");
    for(i = 1; i < snake.length; i++){
        gotoxy(snake.body[i].x, snake.body[i].y);
        cprintf("O");
    }
}

void draw_mouse(){
    gotoxy(mouse.position.x, mouse.position.y);
    textcolor(DARKGRAY);
    cprintf("%c", ms);
}
void title(){
    gotoxy(9, 2);
    textcolor(CYAN);
    cprintf(".:: SNAKE ::.");
}
void draw_point(){
    textcolor(LIGHTGREEN);
    gotoxy(30, 1);
    cprintf("HIGHEST POINT: %d", high_point);
    gotoxy(30, 15);
    cprintf("Your points: %d", point);
    textcolor(LIGHTBLUE);
    gotoxy(30, 17);
    cprintf("ESC -> pause.");
    gotoxy(30, 18);
    cprintf("ENTER -> continue.");
}
void border(){
    int i, x = 5, y = 5;
    textcolor(WHITE);
    for(i = 1; i < 20; i++){
        gotoxy(x + i, y);
        cprintf("%c", V);
        gotoxy(x + i, y + 20);
        cprintf("%c", V);
        gotoxy(x, y + i);
        cprintf("%c", H);
        gotoxy(x + 20, y + i);
        cprintf("%c", H);
    }
    gotoxy(5, 5);
    cprintf("%c", LT);
    gotoxy(25, 5);
    cprintf("%c", RT);
    gotoxy(5, 25);
    cprintf("%c", LB);
    gotoxy(25, 25);
    cprintf("%c", RB);
}
void draw_screen(){
    title();
    border();
    draw_point();
}

void move_up(){
    int i;
    for(i = snake.length - 1; i > 0; i--){
        snake.body[i].x = snake.body[i-1].x;
        snake.body[i].y = snake.body[i-1].y;
    }
    snake.body[i].y--;
}

void move_down(){
    int i;
    for(i = snake.length - 1; i > 0; i--){
        snake.body[i].x = snake.body[i-1].x;
        snake.body[i].y = snake.body[i-1].y;
    }
    snake.body[i].y++;
}

void move_left(){
    int i;
    for(i = snake.length - 1; i > 0; i--){
        snake.body[i].x = snake.body[i-1].x;
        snake.body[i].y = snake.body[i-1].y;
    }
    snake.body[i].x--;
}

void move_right(){
    int i;
    for(i = snake.length - 1; i > 0; i--){
        snake.body[i].x = snake.body[i-1].x;
        snake.body[i].y = snake.body[i-1].y;
    }
    snake.body[i].x++;
}

void move_snake(){
    switch(snake.direction){
        case 72: move_up(); break;
        case 80: move_down(); break;
        case 75: move_left(); break;
        case 77: move_right(); break;
    }
    collision_snake();
    if(snake.eaten_mouse > 0)
        prolong_snake();
}

bool collision_wall(){
    if(snake.body[0].x < 6 || snake.body[0].x > 24 ||
        snake.body[0].y < 6 || snake.body[0].y > 24)
            return true;
    return false;
}

bool collision_mouse(){
    if(snake.body[0].x == mouse.position.x &&
            snake.body[0].y == mouse.position.y){
        point += 5;
        return true;
    }
    return false;
}

bool collision_body(){
    int i;
    for(i = 1; i < snake.length; i++)
        if(snake.body[0].x == snake.body[i].x &&
            snake.body[0].y == snake.body[i].y)
            return true;
    return false;
}

void collision_snake(){
    if(collision_wall() || collision_body()){
            delay(2000);
            game_over();
    }
    if(collision_mouse()){
        mouse.old_position[snake.eaten_mouse].x = mouse.position.x;
        mouse.old_position[snake.eaten_mouse].y = mouse.position.y;
        snake.eaten_mouse++;
        initialize_mouse();
    }
}

void prolong_snake(){
    int i;
    if(abs(mouse.old_position[0].x - snake.body[snake.length - 1].x) == 1 && mouse.old_position[0].y == snake.body[snake.length - 1].y ||
       abs(mouse.old_position[0].y - snake.body[snake.length - 1].y) == 1 && mouse.old_position[0].x == snake.body[snake.length - 1].x){
        snake.length++; 
        snake.body[snake.length - 1].x = mouse.old_position[0].x;
        snake.body[snake.length - 1].y = mouse.old_position[0].y;
        for(i = 0; i < snake.eaten_mouse - 1; i++)
            mouse.old_position[i] = mouse.old_position[i + 1];
        snake.eaten_mouse--;
    }
   
}

void controller(){

    if(kbhit()){
        key = getch();
        key = getch();
            if(key == VK_UP && snake.direction != VK_DOWN)
                snake.direction = VK_UP;
            else
                if(key == VK_DOWN && snake.direction != VK_UP)
                    snake.direction = VK_DOWN;
                else
                    if(key == VK_LEFT && snake.direction != VK_RIGHT)
                        snake.direction = VK_LEFT;
                    else
                        if(key == VK_RIGHT && snake.direction != VK_LEFT)
                            snake.direction = VK_RIGHT;
    }
}
void start_game(){
    FILE *fp;
    initialize_snake();
    initialize_mouse();
    _setcursortype(_NOCURSOR);
   
    fp = fopen("Score.dat", "rt");
    fscanf(fp, "%d", &high_point);
    fclose(fp);
   
    clrscr();
    draw_screen();
    draw_snake();
    draw_mouse();
    gotoxy(8, 15);
    printf("Press Space key");
    gotoxy(10, 16);
    printf("to start!");
    while(getch() != VK_SP){};
}
void game_over(){
    FILE *fp;
    gotoxy(30, 10);
    textcolor(RED);
    cprintf("GAME OVER");
    gotoxy(30, 11);
    cprintf("Press ESC to exit");
    gotoxy(30, 13);
    cprintf("Author: Tsetsentsengel Munkhbayar");
    if(point > high_point){
        fp = fopen("Score.dat", "wt");
        fprintf(fp, "%d", point);
        fclose(fp);
    }
    while(getch() != VK_ESC){};
    exit(0);
}