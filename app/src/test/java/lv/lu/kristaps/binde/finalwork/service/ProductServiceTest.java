package lv.lu.kristaps.binde.finalwork.service;

import lv.lu.kristaps.binde.finalwork.model.Product;
import lv.lu.kristaps.binde.finalwork.model.ProductCategory;
import lv.lu.kristaps.binde.finalwork.model.ProductInputData;
import lv.lu.kristaps.binde.finalwork.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)

public class ProductServiceTest {

    @InjectMocks
    private ProductService victim;

    @Mock
    private ProductRepository repositoryMock;

    @Test
    public void shouldConvertAndStoreProductData() {
        ProductInputData inputData = new ProductInputData();
        inputData.setName("orange");
        inputData.setPrice(0.84);
        inputData.setCategory("FRUIT");
        inputData.setDiscount(5d);
        inputData.setDescription("Very tasty fruit");


        victim.save(inputData);

        Product expectedProduct = new Product();
        expectedProduct.setName("orange");
        expectedProduct.setPrice(BigDecimal.valueOf(0.84));
        expectedProduct.setCategory(ProductCategory.FRUIT);
        expectedProduct.setDiscount(BigDecimal.valueOf(5d));
        expectedProduct.setDescription("Very tasty fruit");

        verify(repositoryMock).save(expectedProduct);
    }
}