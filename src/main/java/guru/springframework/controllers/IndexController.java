package guru.springframework.controllers;

import guru.springframework.models.Category;
import guru.springframework.models.UnitOfMeasure;
import guru.springframework.repos.CategoryRepo;
import guru.springframework.repos.UnitOfMeasureRepo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepo categoryRepo;
    private UnitOfMeasureRepo unitOfMeasureRepo;

    public IndexController(CategoryRepo categoryRepo, UnitOfMeasureRepo unitOfMeasureRepo) {
        this.categoryRepo = categoryRepo;
        this.unitOfMeasureRepo = unitOfMeasureRepo;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepo.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepo.findByDescription("Teaspoon");

        System.out.println("Category id is:" + categoryOptional.get().getId());
        System.out.println("UOM is: " + unitOfMeasureOptional.get().getId());
        return "index";
    }
}

