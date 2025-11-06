package uk.gov.hmrc.jenkinsjobbuilders.domain

abstract class AbstractBuildDescription implements Setting {
    protected final String description
    protected final String regex

    protected AbstractBuildDescription(String regex, String description, String regularExpressionForFailed, String descriptionForFailed) {
        this.regex = regex
        this.description = description
        this.regularExpressionForFailed
        this.descriptionForFailed
    }

    Closure toDsl() {
        return {
            buildDescription(regex, description, regularExpressionForFailed, descriptionForFailed)
        }
    }
}