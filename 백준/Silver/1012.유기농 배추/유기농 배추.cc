#include<iostream>
#include<vector>
#include<queue>
#include<cstring>

using namespace std;


int n; int m; int t;
int map[51][51] = { 0 };
int check[51][51] = { 0 };

int isInside(int x, int y)
{
	//여기에서도 m,n 반대로 적어주기!!
	//맵 탐색하는거니까!!!
	if (x <= n && x >= 1 && y <= m && y >= 1)
	{
		return 1;
	}
	else
	{
		return 0;
	}

}

int dx[] = { 0,0,-1,1 };
int dy[] = { -1,1,0,0 };

int ans = 0;

void bfs(int x, int y)
{
	queue<pair<int, int>> q;
	q.push(pair<int, int>(x, y));
	check[x][y] = 1;

	while (!q.empty())
	{
		int cur_x = q.front().first;
		int cur_y = q.front().second;
		q.pop();

		for (int i = 0; i < 4; i++)//밭을 탐색
		{
			int next_x = cur_x + dx[i];
			int next_y = cur_y + dy[i];

			if ((isInside(next_x, next_y) == 1) && (check[next_x][next_y] == 0) && (map[next_x][next_y]) == 1)
			{
				q.push(pair<int, int>(next_x, next_y));
				check[next_x][next_y] = 1;
			}

		}

	}
}

int main(void)
{
	int test_case;
	scanf("%d", &test_case);

	for (int testcasen = 0; testcasen < test_case; testcasen++)
	{

		scanf("%d %d %d", &m, &n, &t);

		//초기화
		//배열에다가 입력, 참조할때도 m,n 반대로 적어주기
		
		ans = 0;
		for (int i = 1; i <= n; i++)
			for (int j = 1; j <= m; j++)
			{
				map[i][j] = 0;
				check[i][j] = 0;
			}



		
		//배추 위치 입력받기
		int a, b;
		for (int i = 1; i <= t; i++)
		{
			scanf("%d %d", &a, &b);
			map[b + 1][a + 1] = 1;
		} 

	
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= m; j++)
			{

				if (map[i][j] == 1 && check[i][j] == 0 )
				{
					//check[i][j] = 1;
					ans++;	bfs(i, j);
				}
			}
		}


		printf("%d\n", ans);
	}
}