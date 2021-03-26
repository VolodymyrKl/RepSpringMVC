package com.ciklum.internship.controller;

import com.ciklum.internship.service.ProductService;
import com.ciklum.internship.service.impl.ProductServiceImpl;
import com.ciklum.internship.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    public static final String REDIRECT = "redirect:/";
    private final ProductService productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @GetMapping(value = {"/", "index"})
    public ModelAndView showIndex() {
        List<Product> productList = productService.listAll();
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("productList", productList);
        return modelAndView;
    }

    @GetMapping("/new")
    public String newProductForm(Map<String, Object> model) {
        Product product = new Product();
        model.put("product", product);
        return "new_product";
    }

    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product product) {
        productService.save(product);
        return REDIRECT;
    }

    @PostMapping("/edit")
    public ModelAndView edit(@RequestParam int id) {
        ModelAndView modelAndView = new ModelAndView("edit_product");
        Product product = productService.get(id);
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id) {
        productService.delete(id);
        return REDIRECT;
    }
}
