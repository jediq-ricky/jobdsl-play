
job {
	name "mot-pipeline"
	scm {
		git "git@gitlab.motdev.org.uk:mot/mot.git"
	}
	triggers {
		scm "H/10 * * * *"
	}
	steps {
		pipelineJob('mot-pipeline')
	}
}
