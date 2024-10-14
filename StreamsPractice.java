//Streams used for applying functionality programming
//        Ways to declare Stream :
//
//        1) int[] a2={1,2,3,4,5,6,7};
//        int EvenSumStreams = Arrays.stream(a2).filter(n->n%2==0).sum();
//
//        2)    List<String> s = Arrays.asList("A","B","C","D");
//        Stream<String> stream=  s.stream();
//
//        3)Stream<Integer> limit =   Stream.iterate(0,n->n+1).limit(100);
//        limit.forEach(System.out::println);
//
//
//        **converting list to stream proceed with filters and then convert back to list
//        List<Integer> list = Arrays.asList(12,3,2,34,3,22,123,3232,5645);
//        List<Integer> filteredList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(filteredList);
//
//        ----filter
//        List<Integer> list = Arrays.asList(12,3,2,34,3,22,123,3232,5645);
//        List<Integer> filteredList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
//        System.out.println(filteredList);
//
//        ----map----
//        List<Integer> mappedList= list.stream().map(n->n/10).collect(Collectors.toList());
//        System.out.println(mappedList);
//        }
//
//        ----we can use distinct for not repeated values    &&   --- sorted() for sorting the values && for descending sorted(a,b)->(b-a)  it will sort in descending order
//        List<Integer> mappedList= list.stream().map(n->n/10).distinct().collect(Collectors.toList());
//
//
//        ------limit and skip --- we want only first three elements and now i want to skip first value then use skip
//        List<Integer> mappedList= list.stream().map(n->n/10).limit(3).skip(1).collect(Collectors.toList());
//
//        ---max and min ---usign \\
//
//        **using parallel stream if we have bigger collections so we can achieve higher performance



import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
        public static void main(String[] args)
        {
//            int a[]={1,2,3,4,5,6,7};
//            int EvenSum=0;
//            for(int i=0;i<a.length;i++)
//            {
//                if(a[i]%2==0)
//                {
//                    EvenSum+=a[i];
//                }
//            }
//            System.out.println(EvenSum+" sum through for loop ");
//
//            int[] a2={1,2,3,4,5,6,7};
//            int EvenSumStreams = Arrays.stream(a2).filter(n->n%2==0).sum();
//            System.out.println(EvenSumStreams+" sum through stream");



            //---Ways to create Streams ----
//            List<Integer> s = Arrays.asList(4,3,5,3,4,2);
//            Stream<Integer> stream=  s.stream();
//            int sum = stream.filter(n->n%2==0).mapToInt(Integer::intValue).sum();
//            System.out.println(sum);
//
//              Stream<Integer> limit =   Stream.iterate(0,n->n+1).limit(100);
//               limit.forEach(System.out::println);


//            ---Practice map , filter ,reduce --
//            ----filter
            List<Integer> list = Arrays.asList(12,3,2,34,3,22,123,3232,5645);
////            List<Integer> filteredList = list.stream().filter(n->n%2==0).collect(Collectors.toList());
//            System.out.println(filteredList);

            //--Mapped


             List<Integer> mappedList= list.stream().map(n->n/10).collect(Collectors.toList());
            System.out.println(mappedList);
        }
}
