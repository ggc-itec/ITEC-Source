//
//  main.m
//  misc
//

#import <Foundation/Foundation.h>

int main (int argc, const char * argv[])
{

    NSAutoreleasePool *pool = [[NSAutoreleasePool alloc] init];
    NSMutableArray *array = [[NSMutableArray alloc] init];
    NSMutableArray *array2 = [NSMutableArray array];
    
    for(int i=0; i<100; i++)
    {
        [array addObject:@"ggc"];
    }
    
    NSLog(@"%@",[array objectAtIndex:50]);
    [array2 addObject:@"stuff"];
    [array2 replaceObjectAtIndex:0 withObject:@"stiff"];
    
    NSLog(@"%@",[array2 objectAtIndex:0]);
    [array release];
    [pool release];
    return 0;
}

