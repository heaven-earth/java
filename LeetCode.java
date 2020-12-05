package PACKAGE_NAME;

public class LeetCode {
    int CompInt(const void *_xp, const void *_yp)
    {
    	int *xp = (int*)_xp;//qsort是无类型函数，需要进行强转。
    	int *yp = (int*)_yp;

    	if (*xp > *yp){
    		return 1;
    	}
    	else if (*xp < *yp){
    		return -1;
    	}
    	else{
    		return 0;
    	}
    }

    void Print(int *arr, int num)
    {
    	for (int i = 0; i < num; i++){
    		printf("%d ", arr[i]);
    	}
    	printf("\n");
    }

    int CompStr(const void *_xp, const void *_yp)
    {
    	char *s1 = *(char**)_xp;
    	char *s2 = *(char**)_yp;

    	return strcmp(s1, s2); // 1 0 -1
    }

    void swap(char *src, char *dst, int size)//每个数一个char一个char地交换
    {
    	while (size){
    		char temp = *src;
    		*src = *dst;
    		*dst = temp;
    		size--;
    		src++, dst++;
    	}
    }

    void my_qsort(void *arr, int num, int size, int(*comp)(const void*, const void*))
    {
    	assert(arr != NULL);
    	assert(comp != NULL);

    	char *e = (char*)arr;

    	for (int i = 0; i < num - 1; i++){
    		int flag = 0;
    		for (int j = 0; j < num - 1 - i; j++){
    			if (comp(e + j*size, e + (j + 1)*size) > 0){
    				flag = 1;
    				swap(e + j*size, e + (j + 1)*size, size);
    			}
    		}

    		if (flag == 0){
    			break;
    		}
    	}
    }
}
