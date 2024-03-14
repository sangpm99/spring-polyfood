//package com.example.polyfood.DataInitializer;
//
//import com.example.polyfood.Models.ProductDetail;
//import com.example.polyfood.Repositories.ProductDetailRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.ApplicationArguments;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Arrays;
//import java.util.List;
//
//@Component
//public class ProductDetailInitializer implements ApplicationRunner {
//    private final ProductDetailRepository productDetailRepository;
//
//    @Autowired
//    public ProductDetailInitializer(ProductDetailRepository productDetailRepository) {
//        this.productDetailRepository = productDetailRepository;
//    }
//
//    @Override
//    public void run(ApplicationArguments args) {
//        if (productDetailRepository.count() == 0) {
//            List<ProductDetail> list = Arrays.asList(
//                    new ProductDetail(1, 1, "Món ăn truyền thống của Việt Nam không chỉ thể hiện bản sắc văn hóa mà còn là cách thể hiện tình yêu và sự quan tâm của người nội trợ đối với gia đình. Một trong những món ngon và đậm đà mà người Việt thường chuộng trong các dịp quan trọng là 'cá thu kho tộ chay.' Đây là một món ăn ngon và thơm ngon, được làm từ cá thu và cơm trắng, phối hợp với các loại gia vị đặc biệt để tạo nên hương vị đặc trưng của miền Nam Việt Nam."),
//                    new ProductDetail(2, 1, "Món cá thu kho tộ chay là một món ăn độc đáo và ngon miệng, thể hiện sự tỉ mỉ và tình cảm của người nội trợ trong việc chuẩn bị và nấu nướng. Nó thường được dùng trong các dịp đặc biệt như Tết nguyên đán, lễ cưới hoặc khi có khách quý. Hương vị độc đáo của món ăn này cùng với màu sắc tươi đẹp của lá chuối non và ớt tươi khiến cho người thưởng thức không thể quên. Chắc chắn rằng món cá thu kho tộ chay sẽ làm cho bữa ăn của bạn thêm trọn vẹn và đáng nhớ."),
//                    new ProductDetail(3, 2, "Cá kèo chay là một biểu tượng của tâm hồn ẩm thực Việt. Món ăn này được chế biến từ cá kèo tươi ngon, kết hợp với các nguyên liệu chay tinh tế như nấm, bún, và nhiều loại gia vị tỏa hương độc đáo. Đặc trưng vị ngon của món cá kèo chay thể hiện sự kỹ lưỡng và tình cảm khi nấu nướng của người nội trợ."),
//                    new ProductDetail(4, 2, "Cá kèo chay không chỉ là món ăn ngon mà còn là biểu tượng của sự quan tâm gia đình. Thường được thưởng thức trong những dịp đặc biệt như Tết, ngày lễ hoặc cuộc họp gia đình, món cá kèo chay mang đến không gian ấm cúng và hương vị đặc biệt, làm cho bữa ăn trở nên trọn vẹn và đáng nhớ. Mỗi miếng cá kèo chay là một biểu tượng của tình yêu và tâm hồn của người Việt đối với thực phẩm và gia đình."),
//                    new ProductDetail(5, 3, "Trong thế giới ẩm thực chay, 'giò nấm chay' nổi bật như một món ăn vô cùng độc đáo và hấp dẫn. Không chỉ là lựa chọn hoàn hảo cho những người tuân thủ chế độ ăn chay, mà nó còn ghi điểm với mọi thực khách nhờ hương vị thanh lịch và tinh tế."),
//                    new ProductDetail(6, 3, "'Giò nấm chay' được chế biến từ những loại nấm tươi ngon, kết hợp với các nguyên liệu chay khác nhau như bún, rau sống, và gia vị thơm ngon. Món ăn này không chỉ là sự hòa quyện của các thành phần chay mà còn là biểu tượng của sự sáng tạo trong ẩm thực chay, khi nấm thay thế cho nguyên liệu động vật một cách xuất sắc."),
//                    new ProductDetail(7, 3, "'Giò nấm chay' không chỉ thể hiện sự biến tấu tinh tế về hương vị mà còn mang đến sự tươi mát và nhẹ nhàng cho bữa ăn. Đây là một món ăn phổ biến trong các bữa tiệc, cuộc họp gia đình hoặc những buổi tối lãng mạn. Hương thơm và vị ngon độc đáo của 'giò nấm chay' chắc chắn sẽ làm cho bạn phải thán phục và muốn thử nhiều lần. Món ăn này thể hiện sự thanh lịch và tinh tế của ẩm thực chay, và là lựa chọn tuyệt vời cho những người yêu thích hương vị ngon và lành mạnh."),
//                    new ProductDetail(8, 4, "Trong thế giới ẩm thực Việt Nam, món 'khoai môn' là một biểu tượng thực sự của sự phong phú và đa dạng. Được chế biến từ khoai môn, một loại cây củ truyền thống, món này không chỉ mang hương vị thơm ngon mà còn gợi lên hình ảnh quê hương và hồi ức tuổi thơ."),
//                    new ProductDetail(9, 4, "Khoai môn có thể được chế biến thành nhiều món ăn khác nhau, từ khoai môn nướng mật ong thơm ngon đến khoai môn chiên giòn. Món khoai môn thường được chế biến với sự tỉ mỉ và tình cảm của người nội trợ, đảm bảo rằng từng miếng khoai môn đều đạt đến hương vị tuyệt vời và giữ lại đặc trưng riêng của nó."),
//                    new ProductDetail(10, 4, "Món 'khoai môn' thường thấy trong bữa ăn gia đình, những buổi họp mặt hoặc các sự kiện quan trọng. Mùi thơm và vị ngon độc đáo của khoai môn khi nóng hổi làm cho người thưởng thức nhớ mãi. Khám phá món 'khoai môn' là trải nghiệm của việc kết nối với hương vị quê hương và một phần của văn hóa ẩm thực Việt Nam."),
//                    new ProductDetail(11, 5, "Cơm sushi chay là một món ăn đa dạng và độc đáo trong thế giới ẩm thực chay, kết hợp giữa nghệ thuật và hương vị lành mạnh. Thường thấy trong các nhà hàng chay và buổi tiệc đặc biệt, món cơm sushi chay mang đến trải nghiệm thú vị cho thực khách."),
//                    new ProductDetail(12, 5, "Món này được tạo nên từ cơm trắng sushimeshi, được trải đều và cân đối trên một lớp rong biển nori. Trên cơm, các loại rau sống, như dưa chuột, bí đỏ, cà rốt, và cải xanh, được cắt nhỏ và sắp xếp một cách tỉ mỉ. Ngoài ra, cơm sushi chay thường đi kèm với nước tương chay và wasabi chay để tạo thêm lớp hương vị đặc trưng và độc đáo."),
//                    new ProductDetail(13, 5, "Cơm sushi chay không chỉ là một sự kết hợp hài hòa giữa các nguyên liệu mà còn thể hiện sự sáng tạo trong nghệ thuật nấu nướng chay. Hương vị lành mạnh và hấp dẫn của món ăn này khiến nó trở thành một lựa chọn ưa thích cho những người yêu thích ẩm thực chay và cả những người không tuân thủ chế độ ăn chay. Cơm sushi chay không chỉ là một món ăn ngon, mà còn là một tác phẩm nghệ thuật thực sự, tạo nên một trải nghiệm ẩm thực đáng nhớ."),
//                    new ProductDetail(14, 6, "Đậu bắp Đồng Nai thường được chế biến thành nhiều món ăn khác nhau, từ món xào đậu bắp thơm ngon đến món canh chua đậu bắp tươi ngon. Nguyên liệu chính, đậu bắp, có vị ngọt tự nhiên và kết cấu mịn màng, tạo nên món ăn dễ ăn và phong phú trong hương vị."),
//                    new ProductDetail(15, 6, "Món 'đậu bắp Đồng Nai' thường thấy trong bữa ăn gia đình, những buổi họp mặt hoặc các lễ hội vùng Đồng Nai. Hương thơm và vị ngon đặc trưng của đậu bắp cùng với các nguyên liệu tươi ngon khác khiến cho món ăn này trở nên đặc biệt và khó quên. Ngoài việc là một phần quan trọng của ẩm thực vùng Đồng Nai, món 'đậu bắp Đồng Nai' còn là biểu tượng của tình yêu và tâm hồn của người dân Đồng Nai đối với thực phẩm và vùng quê của họ."),
//                    new ProductDetail(16, 7, "Nguyên liệu này được tạo nên từ củ tỏi trắng, một loại gia vị truyền thống, nhưng có một sự biến tấu hoàn toàn khác biệt. Củ tỏi được lấy ra từ vỏ, sau đó được chế biến theo cách độc đáo, thường là sơ chế và nướng. Sự tỉ mỉ trong việc chế biến và gia vị tạo nên hương vị riêng biệt của món 'củ tỏi cô đơn.'"),
//                    new ProductDetail(17, 7, "Nguyên liệu này thường được thưởng thức trong các nhà hàng chay hoặc trong các buổi tiệc đặc biệt. Hương thơm và vị ngon độc đáo của 'củ tỏi cô đơn' chắc chắn sẽ làm bạn phải ấn tượng và muốn thử nhiều lần. Đồng thời, món 'củ tỏi cô đơn' cũng thể hiện sự sáng tạo và tinh tế trong nghệ thuật nấu nướng chay, là lựa chọn tuyệt vời cho những người yêu thích hương vị độc đáo và lành mạnh."),
//                    new ProductDetail(18, 8, "Trà Ô Long TeaPlus là một sản phẩm thú vị và độc đáo trong thế giới thức uống. Được tạo ra từ sự kết hợp giữa trà Ô Long truyền thống và phong cách hiện đại, sản phẩm này mang đến một trải nghiệm thức uống độc đáo và đa dạng."),
//                    new ProductDetail(19, 8, "Hương thơm và vị ngon độc đáo của Trà Ô Long TeaPlus chắc chắn sẽ làm cho bạn phải thử và tận hưởng. Đồng thời, sự kết hợp giữa trà truyền thống và phong cách hiện đại của sản phẩm này tạo ra một trải nghiệm thú vị và thú vị cho những người yêu thích thức uống đa dạng."),
//                    new ProductDetail(20, 9, "Nước Ion Pocari Sweat là một thức uống thể thao phổ biến với tên gọi độc đáo, giúp phục hồi nước và khoáng chất trong cơ thể sau khi hoạt động thể thao hoặc trong những ngày nhiệt đới. Sản phẩm này đã trở thành một phần không thể thiếu của cuộc sống hàng ngày cho nhiều người và được biết đến với mục tiêu cân bằng cơ thể và tinh thần."),
//                    new ProductDetail(21, 9, "Pocari Sweat là một thức uống được phát triển để thay thế các khoáng chất và nước mất đi qua mồ hôi trong quá trình vận động. Nó cung cấp nước, điện giải và khoáng chất cần thiết như natri, kali và canxi. Thức uống có hương vị nhẹ nhàng, giúp cân bằng lại nước và khoáng chất một cách hiệu quả."),
//                    new ProductDetail(22, 10, "Một salat rau cơ bản thường bao gồm rau sống như xà lách, cải, rau cải, cà rốt và các loại rau xanh khác. Các thành phần bổ sung có thể là hạt điều, quả bơ, hạt lanh, cà chua, trái cây, thậm chí là phô mai hoặc thịt nếu bạn không ăn chay. Salat rau thường được chế biến với sốt, như sốt vinaigrette, sốt mù tạt, sốt gia vị hoặc sốt kem."),
//                    new ProductDetail(23, 10, "Salat rau thường được ăn trong bữa trưa hoặc bữa tối, và là một món ăn lành mạnh và tươi mát. Nó có nhiều biến thể và có thể tùy chỉnh theo khẩu vị riêng, là lựa chọn phổ biến cho những người muốn duy trì một chế độ ăn lành mạnh và cân đối.")
//            );
//            productDetailRepository.saveAll(list);
//        }
//    }
//}
