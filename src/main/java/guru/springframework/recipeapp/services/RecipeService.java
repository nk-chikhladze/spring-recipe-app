package guru.springframework.recipeapp.services;

import guru.springframework.recipeapp.commands.RecipeCommand;
import guru.springframework.recipeapp.domain.Recipe;
import javassist.NotFoundException;

import java.util.Set;

public interface RecipeService {
	Set<Recipe> getRecipes();

	Recipe findById(Long l) throws NotFoundException;

	RecipeCommand findCommandById(Long l) throws NotFoundException;

	RecipeCommand saveRecipeCommand(RecipeCommand command);

	void deleteById(Long idToDelete);
}
