# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)
## Duplicates

You have *very big* list of elements. Please provide best solution to detect and remove duplicated elements.

Please provide a solution and **comments** about its benefits and drawbacks. Please give us complexity (`O(n)`, `O(n^2)`, `O(ln(n))`, ...). Please think about custom classes like:

```java
class Person {
    String name;
    int age;
}
```

You can check contest bye-laws [here](http://tech.viacom.com/warsawsdc/confitura2015/Regulamin_konkurs_Viacom_programmer_adventure_2015.pdf).

Check out our Confitura 2015 site [here](http://tech.viacom.com/warsawsdc/confitura2015/)

We are hiring! Visit our [career site](http://tech.viacom.com/careers/).

## Solution

Provided 3 solutions:

1) O(n^2) - just take elements one by one and remove all the other occurrences from the rest of the list

2) O(n) - using additional space for hashtable allocation. The algorithm is fairly simple:

    - take the head
    - check whether hashtable contains
    - if yes then drop this element and continue with tail
    - if no add head to the result list and continue with tail

3) O(n*log(n)) - average - the third one with the quick sort is not stable because the resulting list will be sorted so most probably not the same as the expected one. But the solution may be acceptable in some cases

When it comes to the custom classes - the example in ```duplicates.people``` shows that scala case classes provide it out of the box :-).
