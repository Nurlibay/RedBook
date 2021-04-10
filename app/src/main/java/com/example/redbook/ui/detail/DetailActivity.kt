package com.example.redbook.ui.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.example.redbook.R
import com.example.redbook.data.dao.AnimalDao
import com.example.redbook.data.database.RedBookDatabase
import com.example.redbook.data.model.Animal
import kotlinx.android.synthetic.main.activity_detail.*

class DetailActivity : AppCompatActivity() {

    companion object{
        const val ANIMAL_ID = "animalId"
    }

    private var animalId: Int = 0
    private lateinit var currentAnimal: Animal
    private lateinit var dao : AnimalDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Details"

        dao = RedBookDatabase.getInstance(this).dao()
        animalId = intent.getIntExtra(ANIMAL_ID, 0)
        currentAnimal = dao.getAnimalById(animalId)

        tvStatusContent.text = currentAnimal.status
        tvPropagationContent.text = currentAnimal.propagation
        tvHabitatContent.text = currentAnimal.habitat
        tvQuantityContent.text = currentAnimal.quantity
        tvLifeStyleContent.text = currentAnimal.lifestyle
        tvLimitingFactorsContent.text = currentAnimal.limitingFactors
        tvBreedingContent.text = currentAnimal.breeding
        tvSecurityContent.text = currentAnimal.security

        // Pictures set
        Glide
            .with(this)
            .load(resources.getIdentifier("picture${animalId}", "drawable", packageName))
            .into(ivDetailPicture)

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home -> finish()
        }
        return super.onOptionsItemSelected(item)
    }
}